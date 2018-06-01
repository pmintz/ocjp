package nestedclasses;

import nestedclasses.NonLocalInner.NonLocalInnerNested;

class AnonymousInnerClass {
	int x;
	/*static*/ NonLocalInner.NonLocalInnerNested getDescriptiveColor(final NonLocalInner.NonLocalInnerNested color) {
// note the use of anonymous inner classes here
// -- specifically, there is no name for the class and we construct
// and use the class "on the fly" in the return statement!
		//NonLocalInner nl = new NonLocalInner();
		 
		return  new NonLocalInner.NonLocalInnerNested() {
			public String toString() {
				super.print();
				return "You selected a color with RGB values " + color + " " + x;
			}
		};
}
	public static void main(String []args) {
		//NonLocalInner nli = new NonLocalInner();
		AnonymousInnerClass aic = new AnonymousInnerClass();
		NonLocalInner.NonLocalInnerNested descriptiveColor =
				/*AnonymousInnerClass*/aic.getDescriptiveColor(/*nli.new NonLocalInnerNested(4, 4, 4)*/
					new	NonLocalInner.NonLocalInnerNested(3,3,3));
		System.out.println(descriptiveColor);
		//NonLocalInner nl = new NonLocalInner();
		descriptiveColor.print();
	}
}
