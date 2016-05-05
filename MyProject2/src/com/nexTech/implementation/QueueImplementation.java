package com.nexTech.implementation;

import org.apache.commons.lang.ArrayUtils;

public class QueueImplementation {

	private int capacity = 3;
	private int arr[] = new int[capacity];
	private int size = 0;
	private int top = -1;
	int rear = 0;

	public void push(int pushedElement) {
		if (top < capacity - 1) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Element " + pushedElement
					+ " is pushed to Queue !");
			display();
		} else {
			System.out.println("Overflow !");
		}

	}

	public void pop(int p) {
		if (top >= rear) {
			rear++;
			arr = ArrayUtils.remove(arr, 2);
			System.out.println("Pop operation done !");
			display();
		} else {
			System.out.println("Underflow !");
		}
	}

	public void display() {
		if (top >= rear) {
			System.out.println("Elements in Queue : ");
			for (int i = 0; i <arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	/*public int[] deleteElement (int[] array, int target)
    {
        //first we need to find out how big this newArray should be
        int count = 0;
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == target)
            {
            count++;
            }
        }
        int[] newArray = new int[arr.length -count];

        for(int i = 0; i<array.length; i++)
        {

            if(array[i] == target )
            {
                newArray[i] = array[i+1];
            }
            else
            {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }*/

	public static void main(String[] args) {
		QueueImplementation QueueImplementation = new QueueImplementation();
//		QueueImplementation.pop();
		QueueImplementation.push(23);
		QueueImplementation.push(2);
		QueueImplementation.push(73);
		QueueImplementation.push(21);
		//QueueImplementation.pop();
		QueueImplementation.pop(0);
		//QueueImplementation.pop();
		//QueueImplementation.pop();

	}

}
