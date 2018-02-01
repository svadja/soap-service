Compile classes
In the target directory:
```
generate jaxws classes
wsgen.exe -verbose -keep -cp . ua.vsasa.ProcessWSImpl

```

```
generate jaxws classes + xsd and wsdl
wsgen.exe -verbose -keep -cp . ua.vsasa.ProcessWSImpl -wsdl

```