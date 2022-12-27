package _1interfaceEnhancement._5predicates;

public class PredicateInterfaceImpl implements PredicateInterface<Integer> {

    @Override
    public boolean testFunction(Integer age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
}
