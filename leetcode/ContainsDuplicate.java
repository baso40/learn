
class ContainsDuplicate{
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num: nums){

            if(set.contains(num)){
                return false;
            }

            set.add(num);
        }

        return true;
    }
}