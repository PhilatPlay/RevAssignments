
public class Stack {

  private int lastItem = 0;
  private int[] items = new int[0];

  // add items to the stack
  public void push(int newItem) {

	  int index = items.length; // get current length to store as index
	  System.out.println("The array length is: " + index);

	  items = new int[items.length + 1]; // increase the array by 1
	  System.out.println("items after extending the length by 1: " + Arrays.toString(items));

	  items[index] = newItem; // store the value in the index
	  System.out.println("items after storing the new value: "+ Arrays.toString(items));

	  lastItem = newItem; // update lastItem
	  System.out.println("The last item: " + lastItem);
	}

  // remove items from the stack
  public int pop() {
    return 0;
  }

  // view last item
  public int peek() {
    return 0;
  }
}
