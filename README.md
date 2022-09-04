# nps web api for java sdk

[https://github.com/ehang-io/nps/issues/1110](https://github.com/ehang-io/nps/issues/1110)

## mapping version

maven version is same with nps release .

## use

1. add maven repo 
```xml

<denpendence>
    <groupId>io.github.freshgeek</groupId>
    <artifactId>nps-java-sdk</artifactId>
    <version>0.26.10-SNAPSHOT</version>
</denpendence>

```

2. add your config & execute  :

```java
class Example {
	@Test
	public void execute() {
		ClientListForm listForm = new ClientListForm(0, 10, null, "desc");
		// for example:
			// test
			// http://8.219.160.234:8080
		Config config = new Config("your key", "your server base url ");
		System.out.println(listForm.execute(config));
	}
}
```
