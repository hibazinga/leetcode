    public List<Integer> generate(int k){
    	List<Integer> list=new ArrayList<Integer>();
    	for (int i = 1; i < k; i++) {
			int[] A=new int[i];
			for (int j = 0; j <i; j++) {
				A[j]=2;
			}
			list.add(count(A));
			for (int j = 0; j < A.length; j++) {
				A[j]=3;
				list.add(count(A));
			}
		}
    	for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
    	return list;
    }
    private int count (int[] A) {
		int ans=1;
		for (int i = 0; i < A.length; i++) {
			ans*=A[i];
		}
		return ans;
	}
//


    public List<Integer> generate(int k){
    	List<Integer> list=new ArrayList<Integer>();
    	list.add(2);
    	list.add(3);
    	for (int i = 0; i < k; i++) {
			for (int j = 0; j < list.size(); j++) {
				list.add(list.get(j)*2);
				list.add(list.get(j)*3);
			}
			Set<Integer> set=new HashSet<Integer>();
			set.addAll(list);
			list.clear();
			list.addAll(set);
		}
    	return list;
    }
