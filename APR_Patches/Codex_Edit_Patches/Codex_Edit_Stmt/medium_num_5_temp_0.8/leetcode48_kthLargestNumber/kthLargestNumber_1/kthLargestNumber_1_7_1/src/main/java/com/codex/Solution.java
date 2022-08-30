package com.codex;

import java.util.*;

public class Solution {
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
  public static String kthLargestNumber(String[] nums, int k) {

    PriorityQueue<String> minHeap = new PriorityQueue<String>((a, b) -> (a + b).compareTo(b + a));
    for (String num : nums) {
      minHeap.offer(num);
      if (minHeap.size() > k) {
        minHeap.poll();
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!minHeap.isEmpty()) {
      sb.append(minHeap.poll());
    }
    return sb.reverse().toString();
  }
}
}