# Wicket Chart.js

This project combines [Apache Wicket](https://wicket.apache.org) and [Chart.js](https://chartjs.org). 
It provides all charts from Chart.js within Apache Wicket. 
It's completely open source and free to use (also in commercial projects).
Create beautiful charts and graphs in your Wicket project using only Java if you like. Customize every JavaScript and CSS details if you need to.

![Java CI with Maven](https://github.com/pingunaut/wicket-chartjs/workflows/Java%20CI%20with%20Maven/badge.svg)


## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.


### Prerequisites

This project uses Java version 11 minimum 


### Installing

Include wicket-chartjs in your pom.xml

```
<dependency>
  <groupId>de.martinspielmann.wicket</groupId>
  <artifactId>wicket-chartjs</artifactId>
  <version>${wicket-chartjs.version}</version>
</dependency>
```

### Usage

1. Add your data to a chart model:

```
LoadableDetachableModel<Bar> model = LoadableDetachableModel.of(() -> {
  Bar bar = new Bar();
  bar.getData().getLabels().addAll(Label.of("January", "February", "March", "April", "May", "June", "July"));
  BarDataset barDataSet = new BarDataset();
  barDataSet.setLabel("My First dataset");
  barDataSet.setData(new Data(NumberDataValue.of(0, 10, 5, 2.5, 20, 30, 45)));
  bar.getData().getDatasets().add(barDataSet);
  return bar;
})
```

2. Create a chart panel:

```
add(new BarChartPanel("bar", model));
```

3. Add the panel to your HTML markup:

```
<div wicket:id="bar"></div>
```

That was it :) That's your first Chart in Java with wicket-chartjs.



## Built With

* [Maven](https://maven.apache.org/) - Software project management and comprehension tool
* [Wicket](https://wicket.apache.org) - Wicket is an open source, component oriented, serverside, Java web application framework
* [Chart.js](https://chartjs.org/) - Simple yet flexible JavaScript charting for designers & developers

## Contributing

This is stil lwork in progress and not yet feature complete. If you find any problem, don't hesitate to create an issue or PR.

## Versioning

I use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

See the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the Apache License - see the [LICENSE](LICENSE) file for details

