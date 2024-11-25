interface Sortable {
void sort(int[] array);
}
class QuickSort implements Sortable {
@Override
public void sort(int[] array) {
quickSort(array, 0, array.length - 1);
}
private void quickSort(int[] array, int low, int high)
{ if (low < high) {
int pivotIndex = partition(array, low,
high); quickSort(array, low, pivotIndex -
1);
quickSort(array, pivotIndex + 1, high);
}
}
private int partition(int[] array, int low, int high) {
int pivot = array[high];
int i = low - 1;
for (int j = low; j < high; j++)
{ if (array[j] > pivot) {
i++;
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
int temp = array[i + 1];
array[i + 1] = array[high];
array[high] = temp;
return i + 1;
}
}
class MergeSort implements Sortable {
@Override
public void sort(int[] array) {
mergeSort(array, 0, array.length - 1);
}
private void mergeSort(int[] array, int left, int right)
{ if (left < right) {
int mid = (left + right) / 2;
mergeSort(array, left, mid);
mergeSort(array, mid + 1, right);
merge(array, left, mid, right);
}
}
private void merge(int[] array, int left, int mid, int right)
{ int n1 = mid - left + 1;
int n2 = right - mid;
int[] leftArray = new int[n1];
int[] rightArray = new
int[n2];
// Copy data into temporary arrays
System.arraycopy(array, left, leftArray, 0, n1);
System.arraycopy(array, mid + 1, rightArray, 0, n2);
int i = 0, j = 0, k = left;
// Merge the arrays
while (i < n1 && j < n2) {
if (leftArray[i] > rightArray[j]) {
array[k] = leftArray[i];
i++;
} else {
array[k] = rightArray[j];
j++;
}
k++
;
}
while (i < n1) {
array[k] =
leftArray[i]; i++;
k++;
}
while (j < n2) {
array[k] =
rightArray[j]; j++;
k++;
}
}
}
public class exp10 {
public static void main(String[] args) {
int[] array1 = {12, 7, 9, 2, 5, 1, 3};
int[] array2 = {45, 23, 78, 34, 89, 12};
Sortable quickSort = new QuickSort();
quickSort.sort(array1);
System.out.println("QuickSort result Descending: "); 
printArray(array1);
Sortable mergeSort = new MergeSort();
mergeSort.sort(array2);
System.out.println("MergeSort result (Descending):");
printArray(array2);
}
private static void printArray(int[] array) {
for (int num : array) {
System.out.print(num + " ");
}
System.out.println();
}
}