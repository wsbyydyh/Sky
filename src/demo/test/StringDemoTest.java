package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString1() {
		    assertEquals("一个字母变小写",str.smallString("A"),"a");
		}
		public void testSmallString2() {
			assertEquals("一个字母变小写",str.smallString("B"),"b");
	    }
		public void testSmallString3() {
			assertEquals("一个字母变小写",str.smallString("B"),"B");
	    }
		public void testSmallString4() {
			assertEquals("一个字母变小写",str.smallString("B"),"a");
	    }
		public void testSmallString5() {
			assertEquals("一个字母变小写",str.smallString("C"),",");
	    }
		public void testSmallString6() {
			assertEquals("一个字母变小写",str.smallString("D"),"d");
	    }
		public void testSmallString7() {
			assertEquals("一个字母不变",str.smallString("d"),"d");
	    }
		public void testSmallString8() {
			assertEquals("一个字母变小写",str.smallString("E"),"eee");
	    }
		public void testSmallString9() {
			assertEquals("一个字母变小写",str.smallString("FF"),"f");
	    }
		public void testSmallString10() {
			assertEquals("一个字母变小写",str.smallString("G")," ");
	    }
}