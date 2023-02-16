# SMS Noop Sender Plug-in

[![Quality](https://img.shields.io/badge/quality-demo-red)](https://curity.io/resources/code-examples/status/)
[![Availability](https://img.shields.io/badge/availability-source-blue)](https://curity.io/resources/code-examples/status/)

This project provides an open source sms sender plugin for the Curity Identity Server. The only functionality of this plugin is to print the sms to be sent to the log on info level, to be used for debug purposes.

## Building the Plugin

You can build the plugin by issue the command `./gradlew dist`. This will produce a folder in the `build` directory with the plugin JAR file and all the dependencies needed called `sms-sender.noop`, which can be installed.

## Installing the Plugin

To install the plugin, copy the contents of the `sms.noop` folder into `${IDSVR_HOME}/usr/share/plugins` on each node, including the admin node. For more information about installing plugins, refer to the [curity.io/plugins](https://support.curity.io/docs/latest/developer-guide/plugins/index.html#plugin-installation). 
If you are installing on the same machine, make sure that `IDSVR_HOME` is correctly exported in your shell, and iss `./gradlew dist` to build and copy the correct files.

## More Information

Please visit [curity.io](https://curity.io/) for more information about the Curity Identity Server.

