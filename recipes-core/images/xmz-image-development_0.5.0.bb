include image-development_%.bb

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

COMPATIBLE_MACHINE = "bananapro"

# Programs and tools
IMAGE_INSTALL += "packagegroup-xmz-development"
