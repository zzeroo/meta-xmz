inherit cargo

SUMMARY = "modbus-client"
HOMEPAGE = "https://gitlab.com/zzeroo/modbus-client"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://gitlab.com/zzeroo/modbus-client.git;protocol=https;branch=feature/flow_control"
SRCREV = "fd10b48a53ef7c705235def367cff53ab39e8652"
# SRCREV = "${AUTOREV}"
# PV = "1.0+git${SRCPV}"
PR = "r3"

S = "${WORKDIR}/git"

DEPENDS = "udev"

# Fix: No GNU_HASH in the elf binary
INSANE_SKIP_${PN} = "ldflags"
INSANE_SKIP_${PN}-dev = "ldflags"
