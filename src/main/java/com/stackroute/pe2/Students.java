package com.stackroute.pe2;

public class Students{
    int swap,min = 0,max=0,sum=0;
    public String minimum(int[] array,int size)
    {

        for(int i=0;i<size;i++)
        {
 min=array[0];
if(min>array[i])
    min=array[i];
        }
        return "Minimum value is "+min;
    }
    public String maximum(int[] array,int size)
    {
        for(int i=0;i<size;i++)
        {
            max=array[0];
            if(max<array[i])
                max=array[i];
        }
        return "Maximum value is "+max;
    }
    public String average(int[] array,int size)
    {
        for(int i=0;i<size;i++)
        {
            sum=sum+array[i];

        }
        int average=sum/size;
        return "Average is "+average;
    }
}
