include recipes-core/images/core-image-base.bb

COMPATIBLE_MACHINE = "bananapro"

PR = "r0"

# Programs and tools
IMAGE_INSTALL += "packagegroup-xmz"

# Include modules in rootfs
IMAGE_INSTALL += " \
	kernel-modules \
  wayland \
	weston \
	weston-init \
	weston-config \
	weston-disable-mousepointer \
"

IMAGE_INSTALL += " \
	gtk+3 \
	adwaita-icon-theme \
"

IMAGE_INSTALL += " \
	locale-base-de-de \
	coreutils-locale-de \
"

IMAGE_INSTALL += " \
	xmz-server \
"
