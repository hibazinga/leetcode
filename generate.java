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
