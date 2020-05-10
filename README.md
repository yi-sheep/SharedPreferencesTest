# SharedPreferencesTest

持久化储存之SharedPreferences

1. 通过getSharedPreferences()/getPreferences()获取到getSharedPreferences实例。
	
	getSharedPreferences()
	需要传入两个参数第一个是储存文件的名字，第二个是Context.MODE_PRIVATE表示这个文件只能被该应用程序使用
	getPreferences()
	只需要传入一个参数,Context.MODE_PRIVATE,储存文件的名字是当前activity的名字
2. SharedPreferencesTest.Editor实例可以开启编辑要保存的数据，调用apply()进行保存

	可以使用
	SharedPreferencesTest.Editor.apply{

	}
	进行链式调用，{}之间的上下文就是SharedPreferencesTest.Editor

3. 保存的方式是以键值对的形式保存
	
	比如 putString(key:String,?:?) 保存一个String类型的数据
	第一个参数是key：String 第二个参数是数据

4. 获取保存的数据
	
	比如 getString(key:String,?:?) 获取一个String类型的数据
	第一个参数是key 第二个是缺省值