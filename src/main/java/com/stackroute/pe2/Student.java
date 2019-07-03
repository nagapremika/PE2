package com.stackroute.pe2;

public class Student{       //Returns minimum maximum sum of marks
    int swap,minimum = 0,maximum=0,sum=0;
    public String minimum(int[] array,int size)
    {

        for(int i=0;i<size;i++)
        {
 minimum=array[0];
if(minimum>array[i]){
    minimum=array[i];
        }
            }
        return "Minimum value is "+minimum;
    }
    public String maximum(int[] array,int size)
    {
        for(int i=0;i<size;i++)
        {
            maximum=array[0];
            if(maximum<array[i]) {
                maximum = array[i];
            }
        }
        return "Maximum value is "+maximum;
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
