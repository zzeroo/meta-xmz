include base-image%.bb

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

PR = "r0"

# Auto resize root filesystem on first boot
IMAGE_INSTALL += " \
    e2fsprogs-resize2fs \
    resize-rootfs \
"
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
