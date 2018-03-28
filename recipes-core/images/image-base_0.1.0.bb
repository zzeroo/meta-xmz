include recipes-core/images/core-image-base.bb

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

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
