require recipes-extended/images/core-image-full-cmdline.bb

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

PR = "r5"

# Auto resize root filesystem on first boot
IMAGE_INSTALL += " \
    e2fsprogs-resize2fs \
    resize-rootfs \
"
# Include linux kernel modules in rootfs
IMAGE_INSTALL += "kernel-modules"
# Include linux kernel headers in rootfs
IMAGE_INSTALL += "kernel-devsrc"
# include wayland/ weston
IMAGE_INSTALL += " \
  wayland \
	weston \
	weston-init \
	weston-config \
	weston-disable-mousepointer \
"
# include gtk3 and dependend tools
IMAGE_INSTALL += " \
	gtk+3 \
	adwaita-icon-theme \
"
# german localisation
IMAGE_INSTALL += " \
	locale-base-de-de \
	coreutils-locale-de \
"
# include default CA certificate
IMAGE_INSTALL += " \
  ca-certificates \
"
# ENDE IMAGE BASE


# IMAGE_INSTALL += "autoconf automake binutils binutils-symlinks cpp cpp-symlinks \
#   gcc gcc-symlinks g++ g++-symlinks gettext make libstdc++ libstdc++-dev file coreutils \
#   clang \
# "

# Packet managment
IMAGE_INSTALL += " \
  pkgmgr \
"

# SSH Server
IMAGE_FEATURES += "ssh-server-openssh"

# Packet managment
IMAGE_FEATURES += "package-management"

# Development Tools
IMAGE_FEATURES += "dev-pkgs"

IMAGE_INSTALL += "packagegroup-core-buildessential"

#IMAGE_FEATURES += "dbg-pkgs dev-pkgs ptest-pkgs tools-sdk tools-debug eclipse-debug tools-profile tools-testapps"
#IMAGE_FEATURES += "tools-sdk tools-debug tools-profile tools-testapps" # slang compelliert nicht auf arch linux 03.03.2017
IMAGE_FEATURES += "tools-debug"

#CORE_IMAGE_EXTRA_INSTALL += "apt"
CORE_IMAGE_EXTRA_INSTALL += "opkg"
