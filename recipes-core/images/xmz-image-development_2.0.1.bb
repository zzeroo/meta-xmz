require image-development.bb

LICENSE = "GPLv2"

PR = "r1"

COMPATIBLE_MACHINE = "bananapro"

# Programs and tools
IMAGE_INSTALL += "packagegroup-xmz-development"
