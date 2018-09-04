require image-development.bb

LICENSE = "GPLv2"

PR = "r0"

COMPATIBLE_MACHINE = "bananapro"

# Programs and tools
## 29-08-2018 stm deaktiviert da die `xmz-` programme nicht mit rust stable gebaut werden können
# IMAGE_INSTALL += "packagegroup-xmz"
IMAGE_INSTALL += "packagegroup-xmz-development"


IMAGE_INSTALL += "ntpdate"
IMAGE_INSTALL += "modbus-client"
IMAGE_INSTALL += "xmz-gui"
