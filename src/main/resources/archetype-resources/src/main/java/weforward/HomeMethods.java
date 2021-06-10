package ${package}.weforward;

import cn.weforward.framework.WeforwardMethod;
import cn.weforward.framework.WeforwardMethods;
import cn.weforward.protocol.doc.annotation.DocAttribute;
import cn.weforward.protocol.doc.annotation.DocMethod;
import cn.weforward.protocol.doc.annotation.DocParameter;
import cn.weforward.protocol.support.datatype.FriendlyObject;

/**
 * Hello world!
 *
 */
@WeforwardMethods
public class HomeMethods {

	@WeforwardMethod
	@DocMethod(description = "hello调试示范方法")
	@DocParameter(@DocAttribute(name = "name", type = String.class,description = "hello调试示范方法", example = "我是xxx"))
	public String hello(FriendlyObject params) {
		String name = params.getString("name");
		return "Hello " + name + "!";
	}
}
