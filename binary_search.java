class BinarySearch{

	public static int BinarySearch(int arr[], int len_arr, int key){
		int _first = 0;
		int _last = len_arr - 1;
		int _mid = (_first + _last) / 2;

		while(_first <= _last){
			if(arr[_mid] > key){
				_last = _mid - 1;
			}
			else if(arr[_mid] < key){
				_first = _mid + 1;
			}
			else{
				break;
			}

			_mid = (_first + _last) / 2;
		}
		return _mid;
	}

	public static void main(String[] args){
		int key = 1;
		int[] arr = {0,1,2,3,4};
		int len_arr = arr.length;

		int index = BinarySearch(arr, len_arr, key); 
		System.out.println(index);
	}
}