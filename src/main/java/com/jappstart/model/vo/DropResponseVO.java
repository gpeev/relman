package com.jappstart.model.vo;


public class DropResponseVO
{

    String myTitle;
    String myChannel;
    String myDropDate;

    public String getMyTitle()
    {
        return myTitle;
    }

    public void setMyTitle(String myTitle)
    {
        this.myTitle = myTitle;
    }

    public String getMyChannel()
    {
        return myChannel;
    }

    public void setMyChannel(String myChannel)
    {
        this.myChannel = myChannel;
    }

    public String getMyDropDate()
    {
        return myDropDate;
    }

    public void setMyDropDate(String myDropDate)
    {
        this.myDropDate = myDropDate;
    }

    @Override
    public String toString()
    {
        return "DropResponseVO{" +
                "myTitle='" + myTitle + '\'' +
                ", myChannel='" + myChannel + '\'' +
                ", myDropDate='" + myDropDate + '\'' +
                '}';
    }
}
