inherit cargo

SUMMARY = "Testtool der 'xMZ-Plattform'"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xmz-test-tool"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = " \
  git://github.com/Kliemann-Service-GmbH/xmz-test-tool.git;branch=development;protocol=https \
"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

PR = "r0"

DEPENDS += " \
  gtk+3 \
  glib-2.0-native \
"

# Das Testtool Rezept bindet mit Absicht nicht das systemd Unit Rezept ein.
# Es ist so möglich das Testtool auf beliebgen Images zu installieren, möchte
# man das das Testtool automatisch mit systemd gestartet wird muss optional
# `xmz-test-tool-init` installiert werden.
#

# RDEPENDS_${PN} = " \
#   xmz-test-tool-init \
# "
