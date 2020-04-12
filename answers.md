Search questions:

1. The binary search was not as fast (because it takes humans longer to do things like count the number of objects, or determine a center object), but for a clomputer I think it would be faster. I had to check less items in the binary binary search.

2. Efficiency means the algorithm does not performe an overabundent number of calculations. It does the minimum ammount of work possible, in order to be as fast as possible. Binary search is more efficent.

3. 
    search() -> check index 0, compare the string to "blueberry", the ansswer is false. Repeat for the remaining indexes. "blueberry" was not matched to any index, return -1. Checked 11 items.

    binarySearch() -> acess element at index 5 (found by dividing length by 2), "blueberry" not found. Determine that string beginning with b would come before index 5. Acess element at index 2 (found by dividing new langth (5) by 2). It is "not blueberry". It would occur after this item, final arraylist size is 2, so check both items, neither is "blueberry", return -1. Checked 4 items.

    If list was 1000 items long, search would have acessed all 1000, while binarySearch would access 10 items.