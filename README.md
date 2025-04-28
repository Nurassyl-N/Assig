# Assig
In this assignment, two data structures were implemented in Java:
	1.	MyHashTable<K, V>
	•	A hash table using separate chaining (linked lists) for collision resolution.
	•	Methods:
	•	put(K key, V value) — insert a new key-value pair.
	•	get(K key) — retrieve a value by its key.
	•	remove(K key) — remove a key-value pair by key.
	•	contains(V value) — check if a value exists.
	•	getKey(V value) — retrieve a key by its value.
	•	getSize() — get the current number of elements.
	•	getBucketSize(int index) — get the number of elements in a specific bucket.
	2.	BST<K, V> (Binary Search Tree)
	•	A binary search tree for storing key-value pairs.
	•	Methods:
	•	put(K key, V value) — insert a new key-value pair.
	•	get(K key) — retrieve a value by its key.
	•	delete(K key) — delete an element by its key.
	•	size() — get the number of elements.
	•	iterator() — traverse all elements in sorted order (in-order traversal).

⸻

How Testing Was Performed
	•	For testing MyHashTable:
	•	A separate class MyTestingClass was created as the key (K), with its own hashCode() and equals() methods.
	•	A Student class was created as the value (V).
	•	In TestHashTable:
	•	10001 elements were added (10000 random + 1 special element).
	•	The following methods were tested: put, get, remove, contains, getKey, getSize, getBucketSize.
	•	The number of elements in each bucket was printed.
	•	For testing BST:
	•	In TestBST:
	•	Elements were added using put.
	•	The get and delete methods were tested.
	•	The size of the tree was checked after deletion.
	•	All elements were printed using the iterator (in key-sorted order).
