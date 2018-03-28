SUMMARY = "Server der 'xMZ-Plattform'"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xmz-server"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "file://xmz-server.service"
S = "${WORKDIR}"

PR = "r1"

do_install() {
	install -Dm0644 ${WORKDIR}/xmz-server.service ${D}${systemd_system_unitdir}/xmz-server.service
}

inherit systemd

RDEPENDS_${PN} = "xmz-server"

SYSTEMD_SERVICE_${PN} = "xmz-server.service"
