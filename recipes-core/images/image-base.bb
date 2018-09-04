# Allgemeines Basis Image.
#
# Dieses Image bildet die Grundlage von z.B. `xmz-image` dem Standard Image
# der 'xMZ-Plattform'.
# Auf diesem Image baut dann wiederrum das Image `image-development` auf. Dieses
# wird ausschließlich bei der Entwicklung, in House, eingesetzt.
#
require recipes-core/images/core-image-base.bb

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

# Auto resize root filesystem on first boot
IMAGE_INSTALL += " \
    e2fsprogs-resize2fs \
    resize-rootfs \
"

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
