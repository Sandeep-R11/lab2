/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 * 
 */

 import java.util.Random; 
import java.util.Scanner; 
public class World
{
public static void main(String[] args)
{
int a[]= new int[100000];
Scanner in = new Scanner(System.in); 
long start, end;
System.out.println("*********QUICK SORT PROGRAM *********"); 
System.out.println("Enter the number of elements to be sorted");
int n = in.nextInt();
Random rand= new Random();
for(int i=0;i<n;i++)
{
a[i]=rand.nextInt(10000);
}
System.out.println("Array elements to be sorted are : "); 
for(int i=0; i<n; i++)
 System.out.println(a[i]+" ");
a[n]=9999;
start=System.nanoTime();
quicksort(a,0,n-1); end=System.nanoTime();
System.out.println("\nThe sorted elements are : "); 
for(int i=0; i<n; i++)
System.out.println(a[i]+" ");
 System.out.println("\nThe time taken to sort is"+(end-start)+"ns"); 
 double best = n*Math.log(n);
 double avg = best;
 double worst = n*n;
 System.out.print("\nBest Case = "+Math.round(best)+"\nAverage = "+Math.round(avg)+"\nWorst = "+Math.round(worst));
 System.out.println("\n******** ******************* *******");
}
static void quicksort(int a[],int p, int q)
{
int j;
if(p < q)
{
 j=partition(a,p,q); // partition array into parts 
 quicksort(a,p,j-1); // sort left part of array 
 quicksort(a,j+1,q); // sort right part of array
}
}
static int partition(int a[], int m, int p)
{
 int i, j;
 int v=a[m]; // first element is pivot element 
 i=m;
 j=p;
while(i <= j)
{
 while(a[i] <= v) i++; 
 while(a[j] > v) j--;
if(i < j)
 interchange(a,i,j); //swap the contents
}
a[m] = a[j]; a[j] = v;
return j;
}
static void interchange(int a[], int i, int j)
{
int p;
p = a[i]; a[i] = a[j];
a[j] = p;
}
}

 /*
public class QuickSortLinkedList {
 static class Node {
 int data;
 Node next;
 Node(int d)
 {
 this.data = d;
 this.next = null;
 }
 }
 
 Node head;
 
 void addNode(int data)
 {
 if (head == null) {
 head = new Node(data);
 return;
 }
 
 Node curr = head;
 while (curr.next != null)
 curr = curr.next;
 
 Node newNode = new Node(data);
 curr.next = newNode;
 }
 
 void printList(Node n)
 {
 while (n != null) {
 System.out.print(n.data);
 System.out.print(" ");
 n = n.next;
 }
 }
 
 // Takes first and last node, but do not break any links in the whole linked list
 Node partitionLast(Node start, Node end)
 {
 if (start == end || start == null || end == null)
 return start;
 
 Node pivot_prev = start;
 Node curr = start;
 int pivot = end.data;
 
 // iterate till one before the end, no need to iterate till the end because end is pivot
 while (start != end) {
 if (start.data < pivot) {
 // keep tracks of last modified item
 pivot_prev = curr;
 int temp = curr.data;
 curr.data = start.data;
 start.data = temp;
 curr = curr.next;
 }
 start = start.next;
 }
 
 // Swap the position of curr i.e.next suitable index and pivot
 int temp = curr.data;
 curr.data = pivot;
 end.data = temp;
 
 // Return one previous to current // because current is now pointing to pivot
 return pivot_prev;
 }
 
 void sort(Node start, Node end)
 {
 if (start == null || start == end || start == end.next)
 return;
 
 // Split list and partition recurse
 Node pivot_prev = partitionLast(start, end);
 sort(start, pivot_prev);
 
 // If pivot is picked and moved to the start, that means start and pivot is same
 // so pick from next of pivot
 if (pivot_prev != null && pivot_prev == start)
 sort(pivot_prev.next, end);
 
 // If pivot is in between of the list, start from next of pivot,
 // since we have pivot_prev, so we move two nodes
 else if (pivot_prev != null && pivot_prev.next != null)
 sort(pivot_prev.next.next, end);
 }
 
 // Driver's Code
 public static void main(String[] args)
 {
 QuickSortLinkedList list = new QuickSortLinkedList();
 list.addNode(30);
 list.addNode(3);
 list.addNode(4);
 list.addNode(20);
 list.addNode(5);
 
 Node n = list.head;
 while (n.next != null)
 n = n.next;
 
 System.out.println("Linked List before sorting");
 list.printList(list.head);
 
 // Function call
 list.sort(list.head, n);
 
 System.out.println("\nLinked List after sorting");
 list.printList(list.head);
 }
}
 */

