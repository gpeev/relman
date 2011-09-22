
package net.sourceforge.filebot.ui.panel.subtitle;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import net.sourceforge.tuned.ByteBufferInputStream;
import net.sourceforge.tuned.ByteBufferOutputStream;


class ZipArchive implements Iterable<MemoryFile> {
	
	private final ByteBuffer data;
	

	public ZipArchive(ByteBuffer data) {
		this.data = data.duplicate();
	}
	

	@Override
	public Iterator<MemoryFile> iterator() {
		try {
			return extract().iterator();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	

	public List<MemoryFile> extract() throws IOException {
		List<MemoryFile> vfs = new ArrayList<MemoryFile>();
		
		// read first zip entry
		ZipInputStream zipInputStream = new ZipInputStream(new ByteBufferInputStream(data.duplicate()));
		ZipEntry zipEntry;
		
		try {
			while ((zipEntry = zipInputStream.getNextEntry()) != null) {
				// ignore directory entries
				if (zipEntry.isDirectory()) {
					continue;
				}
				
				ByteBufferOutputStream buffer = new ByteBufferOutputStream((int) zipEntry.getSize());
				
				// write contents to buffer
				buffer.transferFully(zipInputStream);
				
				// add memory file
				vfs.add(new MemoryFile(zipEntry.getName(), buffer.getByteBuffer()));
			}
		} finally {
			zipInputStream.close();
		}
		
		return vfs;
	}
}
