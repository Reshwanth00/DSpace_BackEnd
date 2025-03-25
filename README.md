
# DSpace

[![Build Status](https://github.com/DSpace/DSpace/workflows/Build/badge.svg)](https://github.com/DSpace/DSpace/actions?query=workflow%3ABuild)

[DSpace Documentation](https://wiki.lyrasis.org/display/DSDOC/) |
[DSpace Releases](https://github.com/DSpace/DSpace/releases) |
[DSpace Wiki](https://wiki.lyrasis.org/display/DSPACE/Home) |
[Support](https://wiki.lyrasis.org/display/DSPACE/Support)

## Overview

DSpace open source software is a turnkey repository application used by more than
2,000 organizations and institutions worldwide to provide durable access to digital resources.
For more information, visit http://www.dspace.org/

DSpace consists of both a Java-based backend and an Angular-based frontend.

* Backend (this codebase) provides a REST API, along with other machine-based interfaces (e.g. OAI-PMH, SWORD, etc)
    * The REST Contract is at https://github.com/DSpace/RestContract
* Frontend (https://github.com/DSpace/dspace-angular/) is the User Interface built on the REST API

Prior versions of DSpace (v6.x and below) used two different UIs (XMLUI and JSPUI). Those UIs are no longer supported in v7 and above.
* A maintenance branch for older versions is still available, see `dspace-6_x` for 6.x maintenance.

## Downloads

* Backend (REST API): https://github.com/DSpace/DSpace/releases
* Frontend (User Interface): https://github.com/DSpace/dspace-angular/releases

## Documentation / Installation

Documentation for each release may be viewed online or downloaded via our [Documentation Wiki](https://wiki.lyrasis.org/display/DSDOC/).

The latest DSpace Installation instructions are available at:
https://wiki.lyrasis.org/display/DSDOC8x/Installing+DSpace

Please be aware that, as a Java web application, DSpace requires a database (PostgreSQL)
and a servlet container (usually Tomcat) in order to function.
More information about these and all other prerequisites can be found in the Installation instructions above.

## Running DSpace 8 in Docker

NOTE: At this time, we do not have production-ready Docker images for DSpace.
That said, we do have quick-start Docker Compose scripts for development or testing purposes.

See [Running DSpace 8 with Docker Compose](dspace/src/main/docker-compose/README.md)

## Contributing

See [Contributing documentation](CONTRIBUTING.md)

## Getting Help

DSpace provides public mailing lists where you can post questions or raise topics for discussion.
We welcome everyone to participate in these lists:

* [dspace-community@googlegroups.com](https://groups.google.com/d/forum/dspace-community) : General discussion about DSpace platform, announcements, sharing of best practices
* [dspace-tech@googlegroups.com](https://groups.google.com/d/forum/dspace-tech) : Technical support mailing list. See also our guide for [How to troubleshoot an error](https://wiki.lyrasis.org/display/DSPACE/Troubleshoot+an+error).
* [dspace-devel@googlegroups.com](https://groups.google.com/d/forum/dspace-devel) : Developers / Development mailing list

Great Q&A is also available under the [DSpace tag on Stackoverflow](http://stackoverflow.com/questions/tagged/dspace)

Additional support options are at https://wiki.lyrasis.org/display/DSPACE/Support

DSpace also has an active service provider network. If you'd rather hire a service provider to
install, upgrade, customize, or host DSpace, then we recommend getting in touch with one of our
[Registered Service Providers](http://www.dspace.org/service-providers).

## Issue Tracker

DSpace uses GitHub to track issues:
* Backend (REST API) issues: https://github.com/DSpace/DSpace/issues
* Frontend (User Interface) issues: https://github.com/DSpace/dspace-angular/issues

## Testing

### Running Tests

By default, in DSpace, Unit Tests and Integration Tests are disabled. However, they are
run automatically by [GitHub Actions](https://github.com/DSpace/DSpace/actions?query=workflow%3ABuild) for all Pull Requests and code commits.

* How to run both Unit Tests (via `maven-surefire-plugin`) and Integration Tests (via `maven-failsafe-plugin`):
  ```
  mvn install -DskipUnitTests=false -DskipIntegrationTests=false
  ```
* How to run _only_ Unit Tests:
  ```
  mvn test -DskipUnitTests=false
  ```
* How to run a *single* Unit Test
  ```
  # Run all tests in a specific test class
  # NOTE: failIfNoTests=false is required to skip tests in other modules
  mvn test -DskipUnitTests=false -Dtest=[full.package.testClassName] -DfailIfNoTests=false

  # Run one test method in a specific test class
  mvn test -DskipUnitTests=false -Dtest=[full.package.testClassName]#[testMethodName] -DfailIfNoTests=false
  ```
* How to run _only_ Integration Tests
  ```
  mvn install -DskipIntegrationTests=false
  ```
* How to run a *single* Integration Test
  ```
  # Run all integration tests in a specific test class
  # NOTE: failIfNoTests=false is required to skip tests in other modules
  mvn install -DskipIntegrationTests=false -Dit.test=[full.package.testClassName] -DfailIfNoTests=false

  # Run one test method in a specific test class
  mvn install -DskipIntegrationTests=false -Dit.test=[full.package.testClassName]#[testMethodName] -DfailIfNoTests=false
  ```
* How to run only tests of a specific DSpace module
  ```
  # Before you can run only one module's tests, other modules may need to be installed into your ~/.m2
  cd [dspace-src]
  mvn clean install

  # Then, move into a module subdirectory, and run the test command
  cd [dspace-src]/dspace-server-webapp
  # Choose your test command from the lists above
  ```

## License

DSpace source code is freely available under a standard [BSD 3-Clause license](https://opensource.org/licenses/BSD-3-Clause).
The full license is available in the [LICENSE](LICENSE) file or online at http://www.dspace.org/license/

DSpace uses third-party libraries which may be distributed under different licenses. Those licenses are listed
in the [LICENSES_THIRD_PARTY](LICENSES_THIRD_PARTY) file.
# DSpace_BackEnd




how to setup this Backend in your local

If you are cloning for the first time 

-----|
     |----main----|----backend (here you need to clone the repo)
     |            |
     |            |----root (this is the path where build files will be stored)
     | 
     |---servers--|----apache-tomcat
                  |   
                  |----solr
    


* create a folder called main (like above folder structure) clone this repo inside backend repo

``` git clone https://github.com/Reshwanth00/DSpace_BackEnd.git . ```

* Now create a new folder name root and copy the absolute path of that to know the path run 

``` pwd # and copy the path ```

* Now go inside dspace/config and open dspace.cfg file and change the line dspace.dir = [ paste the copied path of the root ] 

* Now to compile and build java code we need to use maven to build this

``` mvn clean package  ```

* after build success go inside dspace/target/dspace-installer foler and run ant fresh_install

``` cd dspace/target/dspace-installer  ```

* after build success go to root folder that we need created inside main folder and open terminal inside bin folder and run

``` 
sudo ./dspace database migrate 

sudo ./dspace registry-loader -metadata ../config/registries/dublin-core-types.xml

```

* now copy the solr files from root/solr and paste them in servers/solr/server/solr/configsets/

* now run solr again from the path servers/solr/bin 

```

sudo ./solr stop -p 8983 -force


sudo ./solr start -p 8983 -force

```


* now from root/bin run the follwing command

``` sudo ./dspace index-discovery -b ```

* now copy the [server] folder from root/webapps/ and paste them in servers/apache-tomcat/webapps if you found any server folder in the delete that then restart the tomcat server

```
sudo ./shutdowm.sh

sudo ./startup.sh

```

