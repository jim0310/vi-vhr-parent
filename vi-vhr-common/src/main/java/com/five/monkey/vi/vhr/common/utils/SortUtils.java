package com.five.monkey.vi.vhr.common.utils;

import java.util.Arrays;

/**
 * @author jim
 * @date 2021/4/6 10:46
 */
public class SortUtils {

	/**
	 * 冒泡排序,n^2
	 */
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	/**
	 * 选择排序,n^2
	 */
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			swap(arr, minIndex, i);
		}
	}

	private static void swap(int[] arr, int index1, int index2) {
		if (index1 != index2) {
			arr[index1] = arr[index1] ^ arr[index2];
			arr[index2] = arr[index1] ^ arr[index2];
			arr[index1] = arr[index1] ^ arr[index2];
		}
	}

	/**
	 * 插入排序,n^2
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int preIndex = i - 1;
			while (preIndex >= 0 && current < arr[preIndex]) {
				arr[preIndex + 1] = arr[preIndex];
				preIndex--;
			}
			arr[preIndex + 1] = current;
		}
	}

	/**
	 * 希尔排序,n*log2n
	 */
	public static void shellSort(int[] arr) {
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				int preIndex = i - gap;
				int current = arr[i];
				while (preIndex >= 0 && current < arr[preIndex]) {
					arr[preIndex + gap] = arr[preIndex];
					preIndex -= gap;
				}
				arr[preIndex + gap] = current;
			}
		}
	}

	/**
	 * 归并排序,n*log2n
	 */
	public static int[] mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		int midIndex = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, midIndex);
		int[] right = Arrays.copyOfRange(arr, midIndex, arr.length);
		return merge(mergeSort(left), mergeSort(right));
	}

	/**
	 * 归并排序的合并操作
	 */
	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int index = 0;
		for (; lIndex < left.length && rIndex < right.length; index++) {
			if (left[lIndex] <= right[rIndex]) {
				result[index] = left[lIndex];
				lIndex++;
			} else {
				result[index] = right[rIndex];
				rIndex++;
			}
		}
		for (; lIndex < left.length; lIndex++) {
			result[index++] = left[lIndex];
		}
		for (; rIndex < right.length; rIndex++) {
			result[index++] = right[rIndex];
		}
		return result;
	}

	/**
	 * 快速排序
	 */
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int startIndex, int endIndex) {
		if (startIndex < 0 || startIndex >= endIndex || endIndex >= arr.length) {
			return;
		}
		int base = arr[startIndex];
		int leftIndex = startIndex;
		int rightIndex = endIndex;
		while (leftIndex < rightIndex) {
			while (leftIndex < rightIndex && arr[rightIndex] >= base) {
				rightIndex--;
			}
			if (leftIndex < rightIndex && arr[rightIndex] < base) {
				arr[leftIndex] = arr[rightIndex];
				leftIndex++;
			}
			while (leftIndex < rightIndex && arr[leftIndex] <= base) {
				leftIndex++;
			}
			if (leftIndex < rightIndex && arr[leftIndex] > base) {
				arr[rightIndex] = arr[leftIndex];
				rightIndex--;
			}
			if (leftIndex >= rightIndex) {
				arr[leftIndex] = base;
			}
		}
		quickSort(arr, startIndex, leftIndex - 1);
		quickSort(arr, leftIndex + 1, endIndex);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 7, 12, 8, 13, 10, 9, 4, 11, 2, 6 };
		int[] arr1 = { 3 };
		int[] arr2 = {};
		int[] arr3 = { 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		/*
		 * arr = mergeSort(arr);
		 * arr1 = mergeSort(arr1);
		 * arr2 = mergeSort(arr2);
		 */
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
		quickSort(arr1);
		System.out.println(Arrays.toString(arr1));
		quickSort(arr2);
		System.out.println(Arrays.toString(arr2));
		quickSort(arr3);
		System.out.println(Arrays.toString(arr3));
	}

}
