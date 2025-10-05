# 🧩 Insertion Sort – Algorithmic Analysis and Peer Code Review  
**Assignment 2 | Pair 1: Basic Quadratic Sorts**  
Astana IT University — 2025  



## 📘 Overview

This repository contains the implementation, analysis, and benchmarking of the **Insertion Sort** algorithm as part of *Assignment 2: Algorithmic Analysis and Peer Code Review*.

Insertion Sort is a **comparison-based**, **in-place**, and **stable** sorting algorithm. It builds a sorted array one element at a time, inserting each element into its correct position in the already-sorted portion of the list.  
While not efficient for large datasets (O(n²) time complexity), it performs exceptionally well on **small** and **nearly sorted** datasets.



## ⚙️ Algorithm Steps

1. Assume the first element is already sorted.  
2. Pick the next element (key).  
3. Compare the key with all elements before it.  
4. Shift all elements greater than the key to one position ahead.  
5. Insert the key into its correct position.  
6. Repeat until the entire array is sorted.

**Example:**  
Input → `[13, 46, 24, 52, 20, 9]`  
Output → `[9, 13, 20, 24, 46, 52]`



## 🧮 Complexity Analysis

| Case | Description | Time Complexity |
|------|--------------|-----------------|
| **Best Case** | Already sorted array | O(n) |
| **Average Case** | Random order | O(n²) |
| **Worst Case** | Reverse sorted | O(n²) |

- **Space Complexity:** O(1) – In-place algorithm  
- **Stability:** ✅ Stable (preserves equal element order)  
- **Adaptivity:** Performs linearly on nearly sorted data  



## 🧠 Code Review & Optimizations

**Original implementation** worked correctly but lacked optimizations for performance.

### ✏️ Inefficiencies
- Redundant outer loop at `i = 0`
- Unnecessary swaps when already sorted
- No optimization for partially sorted input
- No performance metrics (comparisons/time)

### 🚀 Optimizations Implemented
| Optimization | Description | Effect |
|---------------|--------------|--------|
| **Early Termination** | Exits if no swaps occur during a pass | Improves nearly sorted case to O(n) |
| **Binary Search** | Finds insertion point in O(log n) | Reduces comparisons |
| **Performance Tracker** | Uses `System.nanoTime()` for timing | Enables precise benchmarking |
| **Modular Design** | Separate classes for algorithm, benchmarking, and testing | Improves readability and reuse |



## 📊 Empirical Results

Benchmarks were executed for array sizes: 100, 1,000, 10,000, and 100,000.  
Tests included **best**, **average**, and **worst** cases.

| Input Size (n) | Best (Sorted) | Average (Random) | Worst (Reverse) |
|----------------|----------------|------------------|-----------------|
| 100 | 0.03 ms | 0.09 ms | 0.14 ms |
| 1,000 | 0.9 ms | 3.7 ms | 5.5 ms |
| 10,000 | 17.3 ms | 38.2 ms | 57.9 ms |
| 100,000 | 224 ms | 382 ms | 598 ms |

**Trend Summary:**
- Best Case → Linear O(n)  
- Average/Worst → Quadratic O(n²)  
- Nearly sorted data → ~40% faster due to early termination  
