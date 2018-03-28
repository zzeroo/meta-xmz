SUMMARY = "GUI für die 'xMZ-Plattform'"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "file://xmz-gui.service"
S = "${WORKDIR}"

PR = "r0"

do_install() {
	install -Dm0644 ${WORKDIR}/xmz-gui.service ${D}${systemd_system_unitdir}/xmz-gui.service
}

inherit systemd

RDEPENDS_${PN} = "xmz-gui"

SYSTEMD_SERVICE_${PN} = "xmz-gui.service"
