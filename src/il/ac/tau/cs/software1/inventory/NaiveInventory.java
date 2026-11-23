package il.ac.tau.cs.software1.inventory;

/*
 * A simple array-based Inventory (Question 6).
 */
public class NaiveInventory implements Inventory {

	private static final int INITIAL_CAPACITY = 100;
	private Collectible [] inventory = new Collectible[INITIAL_CAPACITY]; 
	private int count = 0;

	public NaiveInventory() {
		// empty Constructor
	}

	@Override
	public void collect(Collectible collectible) {
		if(count >= inventory.length){
			Collectible [] double_size_inventory = new Collectible[2*(inventory.length)];
			
			for(int i = 0; i < inventory.length; i++)
				double_size_inventory[i] = inventory[i];

			this.inventory = double_size_inventory;
		}

		this.inventory[count] = collectible;
		this.count += 1;
	}

	@Override
	public float getTotalWeight() {
		float TotalWeight = 0;

		for(int i = 0; i < count; i++){
			TotalWeight += inventory[i].getWeight();
		}
		return TotalWeight;	
	}

	@Override
	public int getCurrentCount() {
		return this.count;
	}

	// Returns the array of Collectibles that is stored in the field of this class
	public Collectible[] getCollArr() {
		return this.inventory;
	}
}
