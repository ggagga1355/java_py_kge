package inner_class;

public class Button {
	
	interface OnClickListener{
		void onClick();
	}
	
	private OnClickListener onClickListner;
	
	void setOnClickListener(OnClickListener listener) {
		this.onClickListner = listener;
	}
	
	public void click() {
		onClickListner.onClick();
	}
	
	
}
