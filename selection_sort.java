import java.util.Arrays;

class SelectionSort{
	public static int[] SelectionSort(int arr[], int len_arr){

		for(int _step=0; _step<len_arr-1; _step++){
			int _min_idx = _step;

			for(int _i=_step+1; _i < len_arr; _i++){
				if (arr[_min_idx] > arr[_i]){
					_min_idx = _i;
				}
			}
			
			int _tmp = arr[_step];
			arr[_step] = arr[_min_idx];
			arr[_min_idx] = _tmp;
		}
		return arr;
	}

	public static void main(String[] args){
		int arr[] = {4,3,0,2,1};
		int len_arr = arr.length;

		String _selection_sort = Arrays.toString(SelectionSort(arr, len_arr));
		System.out.println(_selection_sort);
	}
}