SUMMARY = "Packagegroup for xmz images"
HOMEPAGE = "https://github.com/zzeroo/meta-lemaker"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit packagegroup

COMPATIBLE_MACHINE = "^bananapro$"

RDEPENDS_${PN} = "\
  xmz-server \
  xmz-gui \
"
