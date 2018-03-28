SUMMARY = "Packagegroup des OS Images der 'xMZ-Plattform'"
DESCRIPTION = "Diese Packagegroup enhält nur die nötigsten Packete"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xMZ-Plattform"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

inherit packagegroup

COMPATIBLE_MACHINE = "^bananapro$"

RDEPENDS_${PN} = "\
  xmz-server \
  xmz-gui \
"
