inherit cargo

SUMMARY = "CO-NO2-Kombisensor-Mod-Kalibrator"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/CO-NO2-Kombisensor-Mod-Kalibrator"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = " \
  git://github.com/Kliemann-Service-GmbH/CO-NO2-Kombisensor-Mod-Kalibrator.git;branch=development;protocol=https \
"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

PR = "r0"

DEPENDS += " \
  glib-2.0-native \
  gtk+3 \
  libmodbus \
"
