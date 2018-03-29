require image-base.bb

LICENSE = "GPLv2"

PR = "r0"

COMPATIBLE_MACHINE = "bananapro"

# Programs and tools
IMAGE_INSTALL += "packagegroup-xmz"
