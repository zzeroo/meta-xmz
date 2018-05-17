inherit cargo

SUMMARY = "Serverteil der 'xMZ-Plattform'"
HOMEPAGE = "https://kliemann-service-gmbh.github.io/xmz-server"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = " \
  git://github.com/Kliemann-Service-GmbH/xmz-server.git;branch=development;protocol=https \
"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

PR = "r1"


RDEPENDS_${PN} = " \
   xmz-server-init \
"
