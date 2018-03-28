SUMMARY = "systemd Unit für das Testtool der 'xMZ-Plattform'"
HOMEPAGE = "https://github.com/Kliemann-Service-GmbH/xmz-test-tool"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "file://xmz-test-tool.service"
S = "${WORKDIR}"

PR = "r0"

do_install() {
	install -Dm0644 ${WORKDIR}/xmz-test-tool.service ${D}${systemd_system_unitdir}/xmz-test-tool.service
}

inherit systemd

RDEPENDS_${PN} = "xmz-test-tool"

SYSTEMD_SERVICE_${PN} = "xmz-test-tool.service"
