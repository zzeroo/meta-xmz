# Basis Image ohne irgend ein custom Program, mit vanilla weston
#
include recipes-core/images/core-image-minimal.bb

COMPATIBLE_MACHINE = "bananapro"

PR = "r0"

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
"

IMAGE_INSTALL += " \
	wayland \
	weston \
	weston-init \
"
