# oereb2-client-gwt

## TODO
- Models überarbeiten

- ~~replace icon~~
- ~~remove cadastre from gui~~
- ~~remove cadastre from backend (do not forget xsd/jaxb stuff): jaxb-Zeugs kann nicht entfernt werden, weil es für GetEGRIDResponse verwendet wird.~~

- ~~Beim Klick in Karte erst Sanduhr, wenn Abklärung, ob Selbsrecht oder nicht durch ist. Sieht momentan unschön aus, da es a) nur ganz kurz eine Sanduhr gibt und falls kein Selbstrecht gefunden wird, zwei unabhängige nacheinander erscheinen.~~
- ~~ol3 v6 (?): Zwischenzoomlevels sind plötzlich erlaubt. Gefällt mir nicht. -> Bringe es nicht zum Funktionierne mit v6.4.3 und verwende wieder v5.~~

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
