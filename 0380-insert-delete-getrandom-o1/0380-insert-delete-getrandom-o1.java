import java.util.*; 

class RandomizedSet {
    private HashMap<Integer, Integer> valToIndex;
    private ArrayList<Integer>values;
    private Random rand;

    public RandomizedSet() {
        valToIndex=new HashMap<>();
        values=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(valToIndex.containsKey(val)){
            return false;
        }
        valToIndex.put(val,values.size());
        values.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valToIndex.containsKey(val)){
            return false;
        }
        int index=valToIndex.get(val);
        int lastVal=values.get(values.size()-1);

        values.set(index,lastVal);
        valToIndex.put(lastVal,index);

        values.remove(values.size()-1);
        valToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
        return values.get(rand.nextInt(values.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */