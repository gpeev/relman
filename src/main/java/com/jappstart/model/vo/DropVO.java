package com.jappstart.model.vo;


public class DropVO
{

    String title;
    String dropDate;
    String channel;


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDropDate()
    {
        return dropDate;
    }

    public void setDropDate(String dropDate)
    {
        this.dropDate = dropDate;
    }

    public String getChannel()
    {
        return channel;
    }

    public void setChannel(String channel)
    {
        this.channel = channel;
    }

    @Override
    public String toString()
    {
        return "DropVO{" +
                "title='" + title + '\'' +
                ", dropDate='" + dropDate + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
