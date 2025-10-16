# Project 2 @ CSC 201 Fall 2025: AVL Tree

## Pledged Work Policy

This is a ___Pledged Work___ assignment.  This means that the work you submit for grading ___must___ be your work product.
You may not submit the work of others outside of your team, or the modification of work of others outside of your team.
You are encouraged to talk with each other about general problems.  For example, you may talk to someone about "What does it mean when the compiler says there is a semicolon missing on line 20", or "I can not get my assignment template to download from GitHub, what did you do?".  However, you may not engage in "Could you send me a copy of your work so I can see how to get started?".  You may get full and detailed assistance from me, the Teaching Assistant (TA), and the TAs in the Computer Science Center.  If you have any question about the appropriateness of assistance, do not hesitate to consult with me.

Use of ChatGPT or similar resources are encouraged but they must be documented in this README.md. That includes 1) the exact prompt used, 2) the screenshots of the outputs, and 3) your personal assessment on how useful it was. Even erroneous or unuseful results must be documented.

If I believe you have violated our ___Pledge Work___ agreement, I will pursue this matter through the college Honor Council.

## Overview

An AVL Tree is a type of self-balancing Binary Search Tree (BST) that ensures that the tree is approximately balanced. An AVL Tree remains balanced as elements are inserted or deleted. During class, we discussed the general algorithms for a BST and an AVL tree.  In particular, we emphasized how a regular BST structure can become basically a linked list if its balance is not maintained, resulting in a O(N) running time instead of the O(log N) we expect from a properly balanced BST.

In this project, you will:
1. Implement a generic BST with an iterator interface. (You developed this in Project 1, which you can use as is or update.)
2. Implement a generic AVL Tree with an iterator interface.
3. Insert sorted and randomized datasets into BST and AVL Trees.
4. Time the insertion and search operations for BST and AVL Trees.
5. Graph and analyze the insertion and search operation timings.

## Invocation and I/O Files:

The name of the program is `Proj2` ( provided with a `main` method in`Proj2.java` ).

You are encouraged to run and debug code in __IntelliJ IDEA__. Also, the program can be invoked from the command-line as:

```shell
java Proj2 {dataset-file} {number of lines}
```

## 1. **Generic BST with Iterator Interface**

You already created Node and BST classes with a Comparable Interface for Project 1. If your implementation is perfect, you can simply copy over your files and continue to the next section. However, you can make whatever modifications that you deem necessary to complete this project.

## 2. **Generic AVL Tree Interface**

I have enclosed three starter codes:
1. `AvlTree.java`
2. `TestAvl.java`
3. `Proj2.java`

The `AvlTree.java` file contains an overall structure of that AVL Tree class, and you are expected to complete the code where it is indicated (Search for `// FINISH ME`). The `TestAvl.java` file must not be modified, and it will be used for testing your AVL Tree class. It does not check for every error, but I hope that it will be helpful for you. The `Proj2.java` file contains a starter code for you to implement the main driver of the program.

## 3. **Sorted and Randomized Datasets for BST and AVL Trees**

You already created a well-written class to store the records from a dataset for Project 1. If your dataset and implementation is perfect, you can simply copy over your files. However, you can make whatever modifications that you deem necessary to complete this project, and you can also choose a completely different dataset. The source of the dataset and modifications made to it must be documented inside the class.

I have enclosed `Proj2.java` that takes in two command line arguments: 1) the filename if your dataset, and 2) the number of lines of your dataset to read.

You will read your dataset and store the data in an ArrayList. To sort and randomize your ArrayList, you will use the `Collections.sort()` and `Collections.shuffle()` commands.

You will then insert each element if your sorted and randomized ArrayLists into BST and AVL Trees. In total, there will be four trees.

You will then use your original ArrayList to search for each element in your BST and AVL Trees. In total, you will be searching four times.

## 4. **Time the Insertion and Search operations for BST and AVL Trees**

For each of the insertion and search operations, you will use `System.nanoTime()` to calculate the time it takes to run the insertion and search operations for the sorted and randomized BST and AVL Trees. Your program will print out the number of lines and the times to insert and search for BST and AVL Trees to the screen in a human-readable format (i.e., nice to look at) and also separtely to a file named `output.txt` in CSV format. Each time the program runs, it will append the timing results to `output.txt`.

## 5. Graph and analyze the insertion and search operation for BST and AVL Trees**

Run your program several times for different number of lines of your dataset, N, by choosing different values of the second command line argument. After several runs, your `output.txt` file will be filled with timing data.

Using your favorite graphing software (e.g., MS Excel or Google Sheets), plot the running time (in seconds) and rate (in seconds per node) vs. N for each case, comparing the BST and AVL Trees (i.e., two lines per graph). Take a screenshot of your graph and put them here by modifying this file, committing, and pushing it to this repository.

BST vs. AVL Tree running time (insertion):
(insert here)

BST vs. AVL Tree running time (search):
(insert here)

BST vs. AVL Tree running rate (insertion):
(insert here)

BST vs. AVL Tree running rate (search):
(insert here)

## Submission:

Your project will be developed and graded via GitHub. Your final "push" is your final submission, and it must occur before it is due. On Canvas, enter the url to your Github repository. Your project will not be graded without it.

## Recommendations:

I ___strongly suggest___ that you carefully think through your strategy before just jumping into the code.  Once that is working, start adding in new features individually.  A good place to start is building your class.

*In order to get full points of Commenting and Code Style, you need to add comments to every methods and head comments for each file (providing file description, author, date, and acknowledgement).

```
/∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗*
∗ @file: filename.java
∗ @description: This program implements . . .
∗ @author: Your Name
∗ @date: October 21, 2025
∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗/
```


Use of GPT:
Prompt:
        Check if my code is working:
        // AvlTree class
        //
        ///∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗*
        //∗ @file: AvlTree.java
        //∗ @description: This program extends comparable and construct AVL tree
        //∗ @author: Eric Gao
        //∗ @date: October 14, 2025
        //∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗/
        // CONSTRUCTION: with no initializer
        //
        // ******************PUBLIC OPERATIONS*********************
        // void insert( x )       --> Insert x
        // void remove( x )       --> Remove x (unimplemented)
        // boolean contains( x )  --> Return true if x is present
        // boolean remove( x )    --> Return true if x was present
        // Comparable findMin( )  --> Return smallest item
        // Comparable findMax( )  --> Return largest item
        // boolean isEmpty( )     --> Return true if empty; else false
        // void makeEmpty( )      --> Remove all items
        // void printTree( )      --> Print tree in sorted order
        // ******************ERRORS********************************
        // Throws UnderflowException as appropriate

        /**
        * Implements an AVL tree.
        * Note that all "matching" is based on the compareTo method.
        */
        public class AvlTree<AnyType extends Comparable<? super AnyType>> {
        /**
        * Construct the tree.
        */
        public AvlTree( ) {
        root = null;
        }

        /**
        * Insert into the tree; duplicates are ignored.
        * @param x the item to insert.
        */
        public void insert( AnyType x ) {
        root = insert( x, root );
        }

        /**
        * Remove from the tree. Nothing is done if x is not found.
        * @param x the item to remove.
        */
        public void remove( AnyType x ) {
        root = remove( x, root );
        }


        /**
        * Internal method to remove from a subtree.
        * @param x the item to remove.
        * @param t the node that roots the subtree.
        * @return the new root of the subtree.
        */
        private AvlNode<AnyType> remove( AnyType x, AvlNode<AnyType> t ) {
    if( t == null )
    return t;   // If null, do nothing



    if( x.compareTo( t.element ) < 0 )
    t.left = remove( x, t.left );
    else if( x.compareTo( t.element ) > 0 )
    t.right = remove( x, t.right );
    else if( t.left != null && t.right != null ) // Two children
    {
    t.element = findMin( t.right ).element;
    t.right = remove( t.element, t.right );
    }
    else
    t = ( t.left != null ) ? t.left : t.right;
    return balance( t );
    }

    /**
    * Find the smallest item in the tree.
    * @return smallest item or null if empty.
    */
    public AnyType findMin( ) {
    if( isEmpty( ) )
    throw new UnderflowException( );
    return findMin( root ).element;
    }

    /**
    * Find the largest item in the tree.
    * @return the largest item of null if empty.
    */
    public AnyType findMax( ) {
    if( isEmpty( ) )
    throw new UnderflowException( );
    return findMax( root ).element;
    }

    /**
    * Find an item in the tree.
    * @param x the item to search for.
    * @return true if x is found.
    */
    public boolean contains( AnyType x ) {
    return contains( x, root );
    }

    /**
    * Make the tree logically empty.
    */
    public void makeEmpty( ) {
    root = null;
    }

    /**
    * Test if the tree is logically empty.
    * @return true if empty, false otherwise.
    */
    public boolean isEmpty( ) {
    return root == null;
    }

    /**
    * Print the tree contents in sorted order.
    */
    public void printTree( ) {
    if( isEmpty( ) )
    System.out.println( "Empty tree" );
    else
    printTree( root );
    }

    private static final int ALLOWED_IMBALANCE = 1;

    // Assume t is either balanced or within one of being balanced
    private AvlNode<AnyType> balance( AvlNode<AnyType> t ) {
        if( t == null )
        return t;

        if( height( t.left ) - height( t.right ) > ALLOWED_IMBALANCE )
        if( height( t.left.left ) >= height( t.left.right ) )
        t = rotateWithLeftChild( t );
        else
        t = doubleWithLeftChild( t );
        else
        if( height( t.right ) - height( t.left ) > ALLOWED_IMBALANCE )
        if( height( t.right.right ) >= height( t.right.left ) )
        t = rotateWithRightChild( t );
        else
        t = doubleWithRightChild( t );

        t.height = Math.max( height( t.left ), height( t.right ) ) + 1;
        return t;
        }

        public void checkBalance( ) {
        checkBalance( root );
        }

        private int checkBalance( AvlNode<AnyType> t ) {
            if( t == null )
            return -1;
            else {
            int hl = checkBalance( t.left );
            int hr = checkBalance( t.right );
            if( Math.abs( height( t.left ) - height( t.right ) ) > 1 ||
            height( t.left ) != hl || height( t.right ) != hr )
            System.out.println( "OOPS!!" );
            }
            return height( t );
            }


            /**
            * Internal method to insert into a subtree.
            * @param x the item to insert.
            * @param t the node that roots the subtree.
            * @return the new root of the subtree.
            */
            private AvlNode<AnyType> insert( AnyType x, AvlNode<AnyType> t ) {
                if( t == null )
                return new AvlNode<>( x, null, null );

                    int compareResult = x.compareTo( t.element );

                    if( compareResult < 0 )
                    t.left = insert( x, t.left );
                    else if( compareResult > 0 )
                    t.right = insert( x, t.right );
                    return balance( t );
                    }

                    /**
                    * Internal method to find the smallest item in a subtree.
                    * @param t the node that roots the tree.
                    * @return node containing the smallest item.
                    */
                    private AvlNode<AnyType> findMin( AvlNode<AnyType> t ) {
                        if( t == null )
                        return null;
                        else if( t.left == null )
                        return t;
                        return findMin( t.left );
                        }

                        /**
                        * Internal method to find the largest item in a subtree.
                        * @param t the node that roots the tree.
                        * @return node containing the largest item.
                        */
                        private AvlNode<AnyType> findMax( AvlNode<AnyType> t ) {
                            if( t == null )
                            return null;
                            else if( t.right == null )
                            return t;
                            return findMax( t.right );
                            }

                            /**
                            * Internal method to find an item in a subtree.
                            * @param x is item to search for.
                            * @param t the node that roots the tree.
                            * @return true if x is found in subtree.
                            */
                            private boolean contains( AnyType x, AvlNode<AnyType> t ) {
                                while( t != null )
                                {
                                int compareResult = x.compareTo( t.element );

                                if( compareResult < 0 )
                                t = t.left;
                                else if( compareResult > 0 )
                                t = t.right;
                                else
                                return true;    // Match
                                }

                                return false;   // No match
                                }

                                /**
                                * Internal method to print a subtree in (sorted) order.
                                * @param t the node that roots the tree.
                                */
                                private void printTree( AvlNode<AnyType> t ) {
                                    if( t != null )
                                    {
                                    printTree( t.left );
                                    System.out.println( t.element );
                                    printTree( t.right );
                                    }
                                    }

                                    /**
                                    * Return the height of node t, or -1, if null.
                                    */
                                    private int height( AvlNode<AnyType> t ) {
                                        return t == null ? -1 : t.height;
                                        }

                                        /**
                                        * Rotate binary tree node with left child.
                                        * For AVL trees, this is a single rotation for case 1.
                                        * Update heights, then return new root.
                                        */
                                        private AvlNode<AnyType> rotateWithLeftChild( AvlNode<AnyType> k2 ) {
                                            AvlNode<AnyType> k1 = k2.left;
                                                k2.left = k1.right;
                                                k1.right = k2;
                                                k2.height = Math.max( height( k2.left ), height( k2.right ) ) + 1;
                                                k1.height = Math.max( height( k1.left ), k2.height ) + 1;
                                                return k1;
                                                }

                                                /**
                                                * Rotate binary tree node with right child.
                                                * For AVL trees, this is a single rotation for case 4.
                                                * Update heights, then return new root.
                                                */
                                                private AvlNode<AnyType> rotateWithRightChild( AvlNode<AnyType> k1 ) {
                                                    AvlNode<AnyType> k2 = k1.right;
                                                        k1.right = k2.left;
                                                        k2.left = k1;
                                                        k1.height = Math.max( height( k1.left ), height( k1.right ) ) + 1;
                                                        k2.height = Math.max( height( k2.right ), k1.height ) + 1;
                                                        return k2;
                                                        }

                                                        /**
                                                        * Double rotate binary tree node: first left child
                                                        * with its right child; then node k3 with new left child.
                                                        * For AVL trees, this is a double rotation for case 2.
                                                        * Update heights, then return new root.
                                                        */
                                                        private AvlNode<AnyType> doubleWithLeftChild( AvlNode<AnyType> k3 ) {
                                                            k3.left = rotateWithRightChild( k3.left );
                                                            return rotateWithLeftChild( k3 );
                                                            }

                                                            /**
                                                            * Double rotate binary tree node: first right child
                                                            * with its left child; then node k1 with new right child.
                                                            * For AVL trees, this is a double rotation for case 3.
                                                            * Update heights, then return new root.
                                                            */
                                                            private AvlNode<AnyType> doubleWithRightChild( AvlNode<AnyType> k1 ) {
                                                                k1.right = rotateWithLeftChild( k1.right );
                                                                return rotateWithRightChild( k1 );
                                                                }

                                                                private static class AvlNode<AnyType> {
                                                                    // Constructors
                                                                    AvlNode( AnyType theElement ) {
                                                                    this( theElement, null, null );
                                                                    }

                                                                    AvlNode( AnyType theElement, AvlNode<AnyType> lt, AvlNode<AnyType> rt ) {
                                                                        element  = theElement;
                                                                        left     = lt;
                                                                        right    = rt;
                                                                        height   = 0;
                                                                        }

                                                                        AnyType           element;      // The data in the node
                                                                        AvlNode<AnyType>  left;         // Left child
                                                                            AvlNode<AnyType>  right;        // Right child
                                                                                int               height;       // Height
                                                                                }

                                                                                /** The tree root. */
                                                                                private AvlNode<AnyType> root;
                                                                                    }


Answer:
        Looks solid overall—the AVL logic (insert, remove + rebalance, single/double rotations, height maintenance, contains/findMin/findMax) is textbook-correct. A few nitpicks and one likely compile issue:

        ### ✅ Logic/complexity

        * `insert` and `remove` both end with `balance(t)`: good.
        * Two-child delete uses successor (`findMin(right)` then delete): good.
        * Rotations and height updates look correct.
        * `checkBalance()` sanity check is fine.
        * `TestAvl` will leave all evens; `findMin()==2`, `findMax()==NUMS-2` should pass.

        ### ⚠️ Things to fix/know

        1. **`UnderflowException` is missing** (you call it in `findMin/findMax`). Add this tiny class so you compile:

        ```java
        public class UnderflowException extends RuntimeException {
        public UnderflowException() { super(); }
        public UnderflowException(String msg) { super(msg); }
        }
        ```

        2. **Performance/heap**
        `NUMS = 1_000_000` builds ~1M nodes before half are removed. That can be slow and memory-heavy on a default JVM. If you see GC pauses or OOM, try `NUMS = 400_000` or run with a bigger heap (e.g., `-Xmx2g`).

        3. **Compare vs equals**
        `findMin()/findMax()` return `Integer` in your test; `!=` triggers auto-unboxing, so it works. If you ever generalize away from `Integer`, prefer `!Objects.equals(t.findMin(), expected)`.

        4. **Comments/API list**
        The header lists both `void remove(x)` and `boolean remove(x)`; you only implement `void remove(x)`—that’s fine (just sync the comment).

        ### Optional micro-polish

        * In `insert`, when `compareResult == 0` you just `return balance(t);`—functionally OK. If you want to be explicit about ignoring duplicates, you could `return t;` (both end up balanced anyway).

        ### Quick sanity mini-test (small NUMS)

        If you want a fast check without huge memory:

        ```java
        public static void main(String[] args) {
        AvlTree<Integer> t = new AvlTree<>();
    int NUMS = 40, GAP = 37;
    for (int i = GAP; i != 0; i = (i + GAP) % NUMS) t.insert(i);
    for (int i = 1; i < NUMS; i += 2) t.remove(i);
    System.out.println(t.findMin()); // 2
    System.out.println(t.findMax()); // 38
    for (int i = 2; i < NUMS; i += 2) if (!t.contains(i)) System.out.println("missing " + i);
    for (int i = 1; i < NUMS; i += 2) if (t.contains(i)) System.out.println("still has odd " + i);
    }
    ```

    If you add the `UnderflowException` and run with a reasonable heap, your current `AvlTree` + `TestAvl` should work as intended.
