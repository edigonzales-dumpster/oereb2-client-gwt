# oereb2-client-gwt

## TODO
- replace icon
- remove cadastre from gui
- remove cadastre from backend (do not forget xsd/jaxb stuff)


## Development

First Terminal:
```
mvn clean spring-boot:run
```

Second Terminal:
```
mvn clean gwt:generate-module gwt:codeserver
```

Or simple devmode (which worked better for java.xml.bind on client side):
```
mvn gwt:generate-module gwt:devmode 
```
