package many;

import java.util.Map;

public class FirstClass {

    private Map<Integer,Integer> collection;

    public Map<Integer, Integer> getCollection() {
        return collection;
    }

    public void setCollection(Map<Integer, Integer> collection) {
        this.collection = collection;
    }

    public void testInternal() {
        ResearchClass.InternalStaticTwo inStTwo = new ResearchClass.InternalStaticTwo();
        ResearchClass.InternalStaticThree inStThree = new ResearchClass.InternalStaticThree();
        ResearchClass.InternalStaticFour inStFour = new ResearchClass.InternalStaticFour();
    }
}
