<img alt="Flowgate" src="docs/images/Flowgatelogo.png">

# 
FlowGate is an open source vendor-neutral project to enable facility awareness in IT management system and make IT operations management and automation better on high availability, cost saving and improved sustainability, with more information on power, cooling, environment (e.g. humidity, temperature) and security.
<img alt="FlowGate" src="docs/images/FlowGate.png">
# Why
* In enterprise data centers, IT infrastructure and facility are generally managed separately, which leads to information gaps.
* Collaboration between facility and IT infrastructure systems are limited or manual, and virtualization adds more complexity.
* More and more workloads move into off prime colos or clouds where infrastructure are managed via outsourcing, making more gaps.
* Sound IT operations management and automation decisions may not be the best choice if not consider power, cooling or environmental constrains. 
## Features
* **Built-in adapter for multiple DCIM and CMDB system integration.** 
  - Nlyte 
  - PowerIQ 
  - Infoblox 
  - Labsdb
  - IBIS(TODO)
  - Open for other facility system integration.
* **Built-in adapter for multiple IT stack systems**
  - vCenter Server
  - vRealise Operation Manager
  - Open for other IT stack integration. More systems will coming soon.
* **UI based Integration proccess**  One click integration. 
* **Role based access control** API level access control support. 
* **RestAPI support** Provide unified facility information querying services. APIs for all operations and data query make it easy to integrate with other systems.
## Get Start
**DEMO**

[Demo Flowgate v1.0](https://github.com/yixingjia/wormhole/releases/download/1.0/Flowgate_V1.0.mp4)

[Integrate with EdgeXfoundry](https://github.com/yixingjia/wormhole/releases/download/1.0/VBC_Demo_0.5_720.mp4)

**Install from Source code**
[Compile document](docs/compile_guide.md)

**Install from binary**
[Install Document](docs/installation_guide.md)

**System architecture**

## Contributing

The Flowgate project team welcomes contributions from the community. Before you start working with Flowgate, please read our [Developer Certificate of Origin](https://cla.vmware.com/dco). All contributions to this repository must be signed as described on that page. Your signature certifies that you wrote the patch or have the right to pass it on as an open-source patch. For more detailed information, refer to [CONTRIBUTING.md](CONTRIBUTING.md).

## License
[License](LICENSE.txt)

## Feedback
If you find a bug or want to request a new feature, please open a [GitHub Issue](https://github.com/vmware/flowgate/issues)

## CI/CD
![Java CI with Maven](https://github.com/VMware-HaoyuLi/flowgate/workflows/Java%20CI%20with%20Maven/badge.svg?branch=master)
